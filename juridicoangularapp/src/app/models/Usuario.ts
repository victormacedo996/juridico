import { Empresa } from '../models/Empresa';
export interface Usuario{
    id: number;
    cpf: string;
    nomeCompleto: string;
    tipo: number;
    status: number;
    empresa: Empresa;
}