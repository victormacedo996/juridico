import IUsuarioId from "../usuario/IUsuarioId";
import ISolicitacaoAnaliseId from "./ISolicitacaoAnaliseId";

export default interface ISolicitacaoAlocacao{
    id: number,
    data: Date,
    status: number
    solicitacaoAnaliseId: ISolicitacaoAnaliseId,
    usuarioId: IUsuarioId,
    


}