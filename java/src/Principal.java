public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        // ...     

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        // ...

        conta1.setCpf("879.050.350-34");
        conta1.setSaldo(500);
        conta1.setNumeroConta("7007");
        conta1.setAgencia("1001");
        conta1.setLimiteCredito(10000);
        
        
        System.out.println("O cpf do cliente é: " + conta1.getCpf());
        System.out.println("O seu saldo é: "+ conta1.getSaldo());
        System.out.println("O numero da conta é: " + conta1.getNumeroConta());
        System.out.println("A sua agencia é: " + conta1.getAgencia());
        System.out.println("Seu limite de crédito é: " + conta1.getLimiteCredito());
    
}
}