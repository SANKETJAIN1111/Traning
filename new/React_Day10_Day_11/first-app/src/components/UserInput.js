import React , {Component} from 'react';
export class UserInput extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            name:"",
            gender:"",
            number:0,}
       
        this.handleSubmit=this.handleSubmit.bind(this);
      }
      name(event){
        this.setState({name:event.target.value})
    }
    gender(event){
        this.setState({gender:event.target.value})
    }
    number(event){
        this.setState({number:event.target.value})
    } 
   
    handleSubmit(event){
        alert(' Name : '+this.state.name+ ' Gender : ' +this.state.gender+' Mobile No: '+this.state.number);
        console.log(this.state);
        this.setState( {
            name:"",
            gender:"",
            number:0,})
        event.preventDefault();
    }
    render() {
        return (
            <form onSubmit={this.handleSubmit}> 
            <div>Name : <input type = "text" value={this.state.name} onChange={this.name} />
             Gender : M <input type="radio" id="M" name="gender" onChange={this.gender} value={this.state.gender}/> <br></br>
                       F <input type="radio" id="F" name="gender" onChange={this.gender} value={this.state.gender}/>
               <input type = 'number' value={this.state.number} onChange={this.number}/>
                <button type='submit' value="Submit"> Submit </button>
            </div></form>)
    }

}

// export function Input(){
//     return()
// }

export default UserInput;