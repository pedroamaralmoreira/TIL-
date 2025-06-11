dic_produtos = dict()
id_produtos = 1

categorias = ["Alimento", "Bebida", "Higiene", "Limpeza", "Eletrônico"]

#função para solicitar os dados
def solicitar_dados():
  codigo = int(input("Digite o código do produto: "))
  nome = input("Digite o nome do produto que deseja adicionar: ").lower()
  preco = float(input("Digite o preço do produto: ").replace(',', '.'))
  quantidade = int(input("Digite a quantidade do produto: "))
  estoque = int(input("Digite a quantidade mínima que esse produto deve ter: "))

  print("Categorias disponíveis:")
  for cat in categorias:
    print("-", cat)

  while True:
    categoria = input("Digite a categoria: ").capitalize()
    if categoria in categorias:
        print("Categoria válida!")
        break
    else:
        print("Categoria inválida, digite uma das opções disponíveis!")

  return codigo, nome, preco, quantidade, categoria, estoque


#função para adicionar os produtos com nome, código, preço, quantidade, categoria e estoque
def adicionar_produtos():
    global id_produtos
    codigo, nome, preco, quantidade, categoria, estoque = solicitar_dados()

    #Verificar se o produtos já está cadastrado
    codigo_existente = False
    for dados in dic_produtos.values():
      if dados["codigo"] == codigo:
        codigo_existente = True
        break

    # Só adiciona se o código não existir
    if codigo_existente:
      print("O código já está sendo utilizado!")
    else:
      # Verificação da quantidade mínima
      if quantidade < estoque:
        print("Erro: a quantidade atual é menor que a quantidade mínima permitida!")
        return  # Cancela o cadastro
        
    dic_produtos[id_produtos] = {
        "codigo": codigo,
        "nome": nome,
        "preco": preco,
        "quantidade": quantidade,
        "categoria": categoria,
        "estoque": estoque
    }
    print("Produto adicionado com sucesso!")
    id_produtos += 1

#função para atualizar produto existente
def atualizar_produtos():
    nome = input("Digite o nome do produto que deseja atualizar: ")

    encontrado = False
    for id_produto, dados in dic_produtos.items():
        if dados["nome"].lower() == nome.lower():
            print(f"Produto encontrado: {dados}")

            print("O que você deseja atualizar?")
            print("1. Nome")
            print("2. Código")
            print("3. Preço")
            print("4. Quantidade")
            print("5. Quantidade mínima do produto em estoque")
            print("6. Categoria")
            escolha = input("Opção: ")

            if escolha == '1':
                novo_nome = input("Digite o novo nome do produto: ")
                dic_produtos[id_produto]["nome"] = novo_nome
                print("Nome atualizado!")

            elif escolha == '2':
                novo_codigo = int(input("Digite o novo código do produto: "))
                dic_produtos[id_produto]["codigo"] = novo_codigo
                print("Código atualizado!")

            elif escolha == '3':
                novo_preco = float(input("Digite o novo preço do produto: ").replace(',', '.'))
                dic_produtos[id_produto]["preco"] = novo_preco
                print("Preço atualizado!")

            elif escolha == '4':
                nova_quantidade = int(input("Digite a nova quantidade do produto: "))
                dic_produtos[id_produto]["quantidade"] = nova_quantidade
                print("Quantidade atualizada!")

            elif escolha == '5':
                novo_estoque_min = int(input("Digite a nova quantidade mínima do produto: "))
                dic_produtos[id_produto]["estoque_minimo"] = novo_estoque_min
                print("Estoque mínimo atualizado!")

            elif escolha == '6':
                print("Categorias disponíveis:")
                for cat in categorias:
                    print("-", cat)
                while True:
                    nova_categoria = input("Digite a nova categoria: ").capitalize()
                    if nova_categoria in categorias:
                        dic_produtos[id_produto]["categoria"] = nova_categoria
                        print("Categoria atualizada!")
                        break
                    else:
                        print("Categoria inválida, digite uma das opções disponíveis!")

            else:
                print("Escolha uma opção válida.")
            
            encontrado = True
            break

    if not encontrado:
        print("Produto não encontrado.")

#função para remover produto existente
def remover_produto():
  codigo = int(input("Digite o código do produto que deseja remover: "))

  encontrado = False
  for id_produto, dados in dic_produtos.items():
    if dados["codigo"].lower() == codigo.lower():
      print(f"Produto encontrado: {dados}")
      remover = input("Tem certeza que deseja remover? S/N: ").strip().upper()
      if remover == "S":
        del dic_produtos[id_produto]
        print("Produto removido com sucesso!")
      else:
        print("Operação cancelada!")
      encontrado = True
      break

  if not encontrado:
    print("Produto não encontrado")

#função para listar todos os produtos por nome ou preço
def listar_produtos():
    escolha = input("Digite se quer listar por NOME ou PREÇO: ").strip().upper()

    if escolha == "NOME":
        print("Produtos ordenados por nome:")
        for produto in sorted(dic_produtos.values(), key=lambda x: x["nome"].lower()):
            print(f'Nome: {produto["nome"].capitalize()}, Código: {produto["codigo"]}, Preço: {produto["preco"]}, Quantidade: {produto["quantidade"]}')

    elif escolha == "PREÇO":
        print("Produtos ordenados por preço:")
        for produto in sorted(dic_produtos.values(), key=lambda x: x["preco"]):
            print(f'Nome: {produto["nome"].capitalize()}, Código: {produto["codigo"]}, Preço: {produto["preco"]}, Quantidade: {produto["quantidade"]}')

    else:
        print("Opção inválida. Digite NOME ou PREÇO.")

#função para buscar produtos por nome ou código
def buscar_produto():
  escolha = input("Digite se quer buscar por NOME ou CÓDIGO: ").strip().upper()

  encontrado = False
  if escolha == "NOME":
    nome = input("Digite o nome do produto que deseja buscar: ").lower()
    for id_produto, dados in dic_produtos.items():
        if dados["nome"].lower() == nome.lower():
            print(f"Produto encontrado: {dados}")
            encontrado = True

  elif escolha == "CÓDIGO":
    codigo = input("Digite o código do produto que deseja buscar: ")
    for id_produto, dados in dic_produtos.items():
        if dados["codigo"].lower() == codigo.lower():
            print(f"Produto encontrado: {dados}")
            encontrado = True

  else:
        print("Opção inválida. Digite NOME ou CÓDIGO.")

  if not encontrado:
    print("Produto não encontrado!")

#função para registrar venda de produtos
def registrar_venda():
    total_compra = 0

    while True:
        nome = input("Digite o nome do produto: ").strip().lower()
        compra = int(input("Digite a quantidade comprada: "))

        produto_encontrado = False

        for dados in dic_produtos.values():
            if dados["nome"].lower() == nome.lower():
                produto_encontrado = True

                if dados["quantidade"] >= compra:
                    dados["quantidade"] -= compra
                    subtotal = dados["preco"] * compra
                    total_compra += subtotal
                    print(f"{compra} unidade(s) de '{dados['nome']}' vendida(s) por R$ {subtotal:.2f}")
                else:
                    print("Quantidade insuficiente no estoque.")
                break  

        if not produto_encontrado:
            print("Produto não encontrado.")

        escolha = input("Deseja registrar a venda de mais produtos (S/N): ").strip().upper()
        if escolha != 'S':
            break

    print(f"\n>>> O valor total da compra foi de: R$ {total_compra:.2f}\n")

#função para relatório de produtos com estoque baixo
def estoque_baixo():
    print("---- Produtos com estoque abaixo do mínimo ----")
    encontrou = False
    for id_produto, dados in dic_produtos.items():
      if dados["quantidade"] < dados["estoque"]:
        print(f'Produto: {dados["nome"]}, Código: {dados["codigo"]}, Quantidade Atual: {dados["quantidade"]}, Estoque Mínimo: {dados["estoque"]}')
        encontrou = True

    if not encontrou:
        print("Todos os produtos estão com estoque adequado.")
      
#função para somar o valor total do estoque
def valor_estoque():
   print("---- Valor total do estoque ----")

   if not dic_produtos:
      print("Não há produtos cadastrados no estoque.")
      return
   
   valor_total = 0 
   produtos_com_estoque = False

   for dados in dic_produtos.values():
    if dados["quantidade"] > 0:
      produtos_com_estoque = True
      valor_total += dados["preco"] * dados["quantidade"]

   if not produtos_com_estoque:
      print("Todos os produtos cadastrados estão com estoque zerado.")
   else:
      print(f"Valor total do estoque: R$ {valor_total:.2f}")

#função para busca de produtos por categoria
def buscar_categoria():
   
   print("---- Busca por categoria ----")
   for i, categoria in enumerate(categorias, start=1):
      print(f"{i}. {categoria}")

   escolha = input("Digite o número da categoria do produto que deseja buscar: ")

   encontrado = False
   if escolha == '1':
    for id_produto, dados in dic_produtos.items():
        if dados["categoria"].lower() == 'Alimento'.lower():
            print(f"Produto encontrado: {dados}")
            encontrado = True

   elif escolha == '2':
    for id_produto, dados in dic_produtos.items():
        if dados["categoria"].lower() == 'Bebida'.lower():
            print(f"Produto encontrado: {dados}")
            encontrado = True

   elif escolha == '3':
    for id_produto, dados in dic_produtos.items():
        if dados["categoria"].lower() == 'Higiene'.lower():
            print(f"Produto encontrado: {dados}")
            encontrado = True

   elif escolha == '4':
    for id_produto, dados in dic_produtos.items():
        if dados["categoria"].lower() == 'Limpeza'.lower():
            print(f"Produto encontrado: {dados}")
            encontrado = True

   elif escolha == '5':
    for id_produto, dados in dic_produtos.items():
        if dados["categoria"].lower() == 'Eletrônico'.lower():
            print(f"Produto encontrado: {dados}")
            encontrado = True         

   else:
     print("Opção inválida. Digite uma opção válida!")

   if not encontrado:
     print("Produto não encontrado!")


while True:
    print("----- Gerenciamento de Estoque -----")
    print("1. Adiconar novo produto")
    print("2. Atualizar informação de produtos existentes")
    print("3. Remover produto do estoque")
    print("4. Listar todos os produtos por nome ou preço")
    print("5. Buscar produtos por nome ou código")
    print("6. Registrar venda de produtos")
    print("7. Relatório dos produtos com estoque baixo")
    print("8. Valor total do estoque")
    print("9. Busca de produtos por categoria")
    print("10. Encerrar sistema")
    opcao = input("Escolha uma opção: ")

    if opcao == '1':
       adicionar_produtos()

    elif opcao == '2':
       atualizar_produtos()

    elif opcao == '3':
       remover_produto()

    elif opcao == '4':
       listar_produtos()

    elif opcao == '5':
       buscar_produto()

    elif opcao == '6':
       registrar_venda()
    
    elif opcao == '7':
       estoque_baixo()

    elif opcao == '8':
       valor_estoque()

    elif opcao == '9':
       buscar_categoria()

    elif opcao == '10':
       break

    else:
       print("Opção inválida!")