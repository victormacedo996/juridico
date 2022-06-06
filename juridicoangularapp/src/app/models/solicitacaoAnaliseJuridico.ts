import { Arquivo } from "./arquivo";
import { TipoSolicitacao } from "./tipoSolicitacao";
import { Usuario } from "./usuario";

export class SolicitacaoAnaliseJuridico{
    id?:number;
    analiseNumero?:number;
    analiseDataRegistro?:Date;
    titulo?:string;
    observacao?:string;
    status?:number;
    prioridade?:number;
    usuario?:Usuario;
    tipoSolicitacao?:number;
}