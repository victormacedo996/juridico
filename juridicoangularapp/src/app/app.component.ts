import { Component } from '@angular/core';
import { Empresa } from './models/empresa';
import { EmpresaService } from './services/empresa.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Processos Jurídicos App';
}
