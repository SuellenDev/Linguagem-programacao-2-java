/*
Atividade Integrada – Sistema de Gestão Hospitalar
Contexto
O Hospital Vida Saudável está passando por um processo de transformação
digital. Atualmente, grande parte das informações dos pacientes é
armazenada em planilhas e formulários impressos, o que tem gerado
problemas de organização, perda de informações e dificuldades no
acompanhamento dos atendimentos.
A direção do hospital decidiu contratar uma equipe de desenvolvimento para
criar um sistema capaz de gerenciar pacientes, profissionais de saúde e
consultas médicas.
O sistema deverá permitir o cadastro de pessoas vinculadas ao hospital,
armazenar informações clínicas dos pacientes e registrar consultas
realizadas pelos médicos.
Durante as reuniões de levantamento de requisitos, foram identificadas as
seguintes necessidades:
• Todos os pacientes devem possuir um prontuário médico.
• Médicos e enfermeiros são pessoas que trabalham no hospital, mas
possuem características específicas.
• As consultas precisam registrar o médico responsável.
• O sistema deve permitir diferentes formas de agendamento de
consultas.
• Cada tipo de profissional deve apresentar suas informações de forma
personalizada.
A equipe de desenvolvimento decidiu utilizar os conceitos de Programação
Orientada a Objetos para construir uma solução flexível e de fácil
manutenção.
Parte A – Análise do Problema
Antes da implementação, responda às questões:
Questão 1
Quais classes você identifica no estudo de caso?
Questão 2
Quais atributos cada classe deve possuir?
Questão 3
Quais relacionamentos existem entre as classes?
Questão 4
Identifique onde existem relacionamentos de:
• Composição
• Agregação
• Herança
Justifique suas respostas.

Questão 5
Explique por que o conceito de herança pode reduzir a duplicação de código
neste sistema.

1) Classes: Paciente, ProfissionaisSaude e consultasMedicas.
2) Paciente: nome, idade, prontuarioMedico, cpf
Profisionais saude: nome, especialidade, crm, coren
Prontuario: paciente, tipoConsulta, medicoResponsavel, laudos, exames, evolucao,anamnese
consultas medicas: profissionalResponsavel, paciente, prontuario.
3)Consultas e paciente, profissionais e consulta, paciente e prontuario, profissionais e prontuario, consultas e prontuario, paciente e profissionais.
4)Consultas e paciente: Agregação
medico e consulta: Agregação
paciente e prontuario: Composição
profissionais e prontuario: Agregação
consultas e prontuario: Composição
5) Pois a classe filho pode herdar caracteristicas da classe Pai, tendo os mesmos comportamentos pode ser chamada sem gerando um reuso de código. 

*/
