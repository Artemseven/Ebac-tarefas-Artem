package modulo13;

public class TestePessoa {

		public static void main(String[] args) {
			Pessoa fisica = new PessoaFisica();
			fisica.setNome("Eduardo");
			((PessoaFisica) fisica).setCpf(0677274204L);

			
			Pessoa juridica = new PessoaJuridica();
			juridica.setNome("Miguel");
			Pessoa[] pessoas = new Pessoa[2];
			pessoas[0] = fisica;
			pessoas[1] = juridica;

			for(Pessoa pessoa : pessoas) {
				System.out.println(pessoa.getNome());
			}
		}
	}
