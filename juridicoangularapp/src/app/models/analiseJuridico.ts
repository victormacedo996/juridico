import { arquivo } from "./arquivo";
import { tipoSolicitacao } from "./tipoSolicitacao";
import { usuario } from "./usuario";

export class analiseJuridico{
    id:number = 0;
    analiseNumero:number = 0;
    analiseDataRegistro:Date = new Date();
    titulo:string = '';
    observacao:string='';
    status?:number;
    prioridade?:number;
    usuario:usuario = new usuario();
    tipoSolicitacao:tipoSolicitacao = new tipoSolicitacao();
}