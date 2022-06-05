import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { soliocitacaoAnaliseJuridico } from 'src/app/models/solocitacaoAnaliseJuridico';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class RequisicaoService {
  url: string = `${environment.apiBaseUrl}/api/solicitacaoAnaliseJuridico/adicionar`

  constructor(private http: HttpClient) { }
  criarRequisicao(requisicao: soliocitacaoAnaliseJuridico) {

    let goHorseS2 = `{
    "id": 0,
    "numero": 1,
    "dataRegistro": "2022-05-04T21:16:36",
    "titulo": "${requisicao.titulo}",
    "observacao": "${requisicao.observacao}",
    "status": 1,
    "solicitacaoTipo": {
        "id": ${requisicao.tipoSolicitacao},
        "descricao": "Registro de Software",
        "prazo": 15,
        "status": 1
    },
    "usuario": {
        "id": 3,
        "cpf": "12345611111",
        "nomeCompleto": "José da Silva Alves",
        "tipo": 1,
        "status": 1,
        "empresa": {
            "id": 7,
            "nome": "ALDO ROCHA Advogados",
            "cnpj": "39808222000170",
            "status": 1
        }
    }
  }`;
    goHorseS2 = JSON.parse(goHorseS2)
    return this.http.post(this.url, goHorseS2);
  }
  atualizarRequisicao() {

  }
  deletarRequisicao() {

  }
  receberRequisicao() {

  }
}
