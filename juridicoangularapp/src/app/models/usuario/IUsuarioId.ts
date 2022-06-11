import { Empresa } from "../empresa/IEmpresa";

export default interface IUsuarioId{
    id: number,
    cpf: string,
    nomeCompleto: string,
    tipo: number,
    status: number,
    empresa: Empresa
}