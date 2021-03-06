import { CommunService } from './commun.service';
import { PayMonth } from './../Models/PayMonth';
import { catchError } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { throwError, Observable } from 'rxjs';
import { Structure } from '../Models/Structure';

@Injectable({
  providedIn: 'root'
})
export class ClotureMoisService {

  public host:String;
  constructor(private httpClient:HttpClient,communService:CommunService) { 
    this.host = communService.getHost();
  }

  public updatePayMonth():Observable<PayMonth>{
    return this.httpClient.get<PayMonth>(this.host + "updatePayMonth").pipe(
      catchError((err) => {
         //console.log('error caught in service');
        console.error(err);
        return throwError(err);
      })
    );
  }

  public updateStructureClotureMois():Observable<Array<Structure>>{
    return this.httpClient.get<Array<Structure>>(this.host+"updateStructureClotureMois").pipe(
      catchError((err) => {
         //console.log('error caught in service');
        console.error(err);
        return throwError(err);
      })
    );
  }
}
