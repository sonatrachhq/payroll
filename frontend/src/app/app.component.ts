import { TokenStorageService } from './auth/token-storage.service';

import { Component, OnInit  } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{
  title = 'Application Exploitation Paie';
  public connection:Boolean=false;
  currentMonth:String ="";
  constructor(private tokenStorage: TokenStorageService){

  }
 
  ngOnInit() {
    
    if (this.tokenStorage.getToken()) {
      this.connection=true;
      
    }
  }
}
