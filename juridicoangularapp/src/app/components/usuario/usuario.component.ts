import { Usuario } from './../../models/Usuario';
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  displayedColumns: string[] = ['id', 'cpf', 'nomeCompleto','tipo', 'empresa'];
  dataSource : any = [];
  constructor (private usuarioService: UsuarioService){}

  ngOnInit(): void {
    this.listarUsuarios();
  }

  public listarUsuarios(): void {
    this.usuarioService.listarUsuarios().subscribe(
      (response: Usuario[]) => {
        this.dataSource = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }


}
