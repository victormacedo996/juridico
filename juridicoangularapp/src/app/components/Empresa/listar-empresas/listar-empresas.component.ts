import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Empresa } from 'src/app/models/Empresa';
import { EmpresaService } from 'src/app/services/empresa.service';

@Component({
  selector: 'app-listar-empresas',
  templateUrl: './listar-empresas.component.html',
  styleUrls: ['./listar-empresas.component.css']
})
export class ListarEmpresasComponent implements OnInit {


  public empresas: Empresa[] | undefined;
  
  constructor (private empresaService: EmpresaService){}

  ngOnInit(): void {
    this.listarEmpresas();
  }

  public listarEmpresas(): void {
    this.empresaService.listarEmpresas().subscribe(
      (response: Empresa[]) => {
        this.empresas = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
