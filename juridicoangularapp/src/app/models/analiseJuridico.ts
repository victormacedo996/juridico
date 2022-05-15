import { arquivo } from "./arquivo";
import { tipoSolicitacao } from "./tipoSolicitacao";
import { usuario } from "./usuario";

export class analiseJuridico{
    id?:number;
    analiseNumero?:number;
    analiseDataRegistro?:Date;
    titulo?:string;
    observacao?:string;
    status?:number;
    prioridade?:number;
    usuario?:usuario;
    tipoSolicitacao?:tipoSolicitacao;
}