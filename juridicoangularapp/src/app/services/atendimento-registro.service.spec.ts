import { TestBed } from '@angular/core/testing';

import { AtendimentoRegistroService } from './atendimento-registro.service';

describe('AtendimentoRegistroService', () => {
  let service: AtendimentoRegistroService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AtendimentoRegistroService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
