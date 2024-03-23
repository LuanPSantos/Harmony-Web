import { TestBed } from '@angular/core/testing';

import { HarmonicFieldService } from './harmonic-field-service';

describe('HarmonicFieldService', () => {
  let service: HarmonicFieldService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HarmonicFieldService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
