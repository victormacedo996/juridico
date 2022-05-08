import { TestBed } from '@angular/core/testing';

import { RegistroAnaliseAtendimentoService } from './registro-analise-atendimento.service';

describe('RegistroAnaliseAtendimentoService', () => {
  let service: RegistroAnaliseAtendimentoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RegistroAnaliseAtendimentoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
