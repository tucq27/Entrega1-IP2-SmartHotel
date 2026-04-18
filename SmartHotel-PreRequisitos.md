# Sistema Smart Hotel Management

## Descrição

Este sistema tem como objetivo gerenciar a operação de um hotel tecnológico (Smart Hotel), integrando o controle de hóspedes, diferentes tipos de acomodações, consumo e automação de serviços. O foco principal é oferecer uma experiência personalizada, permitindo a gestão eficiente de reservas e o acompanhamento financeiro detalhado de cada estadia.

O sistema deve organizar os quartos por categorias, validar a disponibilidade para períodos específicos, registrar o consumo de itens de frigobar e serviços de quarto, além de automatizar o cálculo de multas e diárias no check-out. Relatórios de ocupação e faturamento devem auxiliar na tomada de decisão gerencial, garantindo que a infraestrutura do hotel seja utilizada de forma otimizada.

## Requisitos Funcionais

### 1. Gestão de Hóspedes e Acomodações
- **REQ01**: Permitir cadastro de hóspedes com dados pessoais, contato, documento e preferências. _OK_
- **REQ02**: Cadastrar quartos com identificação única, andar e status (disponível, sujo, manutenção). _OK_
- **REQ03**: Implementar herança para tipos de quarto: Standard, Suíte e Presidencial. _OK_
- **REQ04**: Definir tarifas baseadas no tipo de quarto e aplicar multiplicadores para alta temporada. _FAZENDO_

### 2. Reservas e Hospedagem
- **REQ05**: Permitir a criação de reservas vinculando hóspede, quarto e período de estadia. _OK_
- **REQ06**: Realizar o Check-in validando a reserva prévia e o horário de entrada. _OK ?_
- **REQ07**: Registrar o Check-out com encerramento da conta e alteração de status para "limpeza". _OK ?_
- **REQ08**: Permitir a reserva de múltiplos quartos vinculados a um único "responsável de grupo". _OK ?_

## OBS: Criar um repositorio de custos (_repositórios não serão necessários para a entrega 1_)

## OBS: Alterações futuras no diagrama/ código
- Além da classe reserva, adicionar a classe hospedagem (considerando que hóspedes podem fazer uma reserva prévia e se hospedarem ou simplesmente chegar no hotel e se hospedar, caso haja quartos disponíveis)
- Criar uma classe Funcionario, que tem as subclasses (herdando de Funcionario): Recepcionista, Lavanderia, Limpeza
- Adicionar como atributos na Reserva: *Recepcionista* (que fez a reserva da pessoa), *Horário de reserva* (hora em que a reserva foi realizada)
- Adicionar um método na classe Reserva que sirva para verificar se a pessoa que fez a reserva é a pessoa de verdade (_ex: alguém pode tentar entrar usando o nome da pessoa, então o sistema também pode pedir nome, cpf e id da reserva para impedir isso_)
- Também dá pra adicionar o método verificarQuartos, pra saber se existe algum quarto disponível no hotel antes de fazer a reserva (_varre todo o arrayList de quartos no hotel e verifica se eles estão disponíveis_)
- Sobre a classe Hospedagem, a gente pode transferir os atributos e métodos de chekIn e chekOut pra ela
- Os atributos da classe Hospedagem vão ser parecidos com a classe Reserva, porque também tem responsável, quarto e id
- Podem existir dois métodos construtores pra Hospedagem:
1. Considera que uma reserva já foi feita antes, então os atributos da Reserva também são herdados (id, responsável, pessoas, quarto) 
2. Considera que nenhuma reserva foi feita então precisa usar o método de verificarQuartos para saber se há algum quarto disponível (_esse método herda da classe reserva_)

### 3. Consumo e Serviços
- **REQ09**: Gerenciar o inventário do frigobar (composição) para cada quarto específico.
- **REQ10**: Registrar consumo de itens do frigobar durante a estadia do hóspede.
- **REQ11**: Registrar pedidos de serviços de quarto (alimentação e lavanderia).
- **REQ12**: Adicionar taxa de conveniência automática para serviços solicitados em horário noturno.

### 4. Financeiro e Pagamentos
- **REQ13**: Calcular o valor total da estadia somando diárias, consumos e taxas.
- **REQ14**: Suportar métodos de pagamento como Cartão, PIX e Faturamento Corporativo.
- **REQ15**: Emitir fatura detalhada com discriminação de impostos em PDF.

### 5. Relatórios e Alertas
- **REQ16**: Gerar relatório de ocupação diária e mensal do hotel.
- **REQ17**: Exportar relatório de faturamento por categoria de quarto em CSV.
- **REQ18**: Notificar a equipe de governança automaticamente após cada Check-out.
- **REQ19**: Alertar a recepção sobre hóspedes que excederam o horário de saída.

### 6. Regras e Restrições
- **REQ20**: **Não permitir Check-in** em quartos com status "sujo" ou "manutenção".
- **REQ21**: **Bloquear reservas** para hóspedes registrados em lista interna de restrições por danos passados.
- **REQ22**: **Impedir cancelamento** gratuito se realizado com menos de 24h de antecedência.
- **REQ23**: **Garantir** que cada item de consumo esteja obrigatoriamente vinculado a uma reserva ativa.
- **REQ24**: **Validar** a capacidade máxima de pessoas por quarto conforme o tipo de acomodação.
- **REQ25**: **Bloquear alteração** de tarifa de uma reserva que já foi sinalizada com pagamento antecipado.

## Possíveis APIs/Bibliotecas
- **JavaFX** – Interface gráfica.
- **Java Time API** – Gestão de datas.
- **JasperReports** – Emissão de faturas.
- **iText** – Para notas fiscais ou confirmações de reservas.
