import React ,{Component} from 'react';
import axios from 'axios';
export class EmployeeItems extends React.Component{
constructor(props){
    super(props);
    this.state = {employees:[]}
}
handleRefresh = (event)=> {
    let url = 'http://localhost:9090/user';
    axios.get(url)
    .then((response)=>this.setState({employees:response.data}))
    .catch((err)=>console.log(err));
}
render(){
    return(<div>
        <div className='row-5'>
        <h2>Employee List :   <button onClick={this.handleRefresh} className ='btn btn-outline-info'>Refresh</button></h2>
        
        </div>
        <table className='table table-sm table-dark table-hover'>
        <thead>
            <tr >
                <th >
                #S.No.
                </th>
                <th>
                    Id
                </th>
                <th>
                    Name
                </th>
                <th>
                    Salary
                </th>
            </tr>
        </thead>
        <tbody>
            {this.state.employees.map((item, index)=> <tr className='row-sm' key={item._id}><td>{index + 1}</td><td>{item._id}</td><td>{item.name}</td><td>{item.salary}</td>
            </tr>)}
        </tbody>

        </table>

    </div>);
}
}
export class EmployeeDelete extends React.Component{
    constructor(props){
        super(props);
        this.state = {employees:[],_id:''}
    }
    handleRefresh = (event)=> {
        let url = 'http://localhost:9090/user';
        axios.get(url)
        .then((response)=>this.setState({employees:response.data}))
        .catch((err)=>console.log(err));
    }
    handleDelete = (_id, e)=> {
              
        let url = `http://localhost:9090/user/${_id}`;
        axios.delete(url)
        .then(res => {  
            console.log(res);  
            console.log(res.data);
        })  
    }
    render(){
        return(<div>
            <div className='row-5'>
            <h2>Employee List :   <button onClick={this.handleRefresh} className ='btn btn-outline-info'>Refresh</button></h2>
            
            </div>
            <table className='table table-sm table-dark table-hover'>
            <thead>
                <tr >
                    <th >
                    #S.No.
                    </th>
                    <th>
                        Id
                    </th>
                    <th>
                        Name
                    </th>
                    <th>
                        Salary
                    </th>
                    <th>
                        Delete Button
                    </th>
                </tr>
            </thead>
            <tbody>
                {this.state.employees.map((item, index)=> <tr className='row-sm' key={item._id}><td>{index + 1}</td><td>{item._id}</td><td>{item.name}</td><td>{item.salary}</td><td><button className='btn btn-danger' onClick={(e) => this.handleDelete(item._id, e)}>Delete</button></td>
                </tr>)}
            </tbody>
    
            </table>
    
        </div>);
    }
    }
    
export class EmployeeStore extends React.Component{
    constructor(props)
    {
        super(props);
        this.state = {_id:'', name:'', salary:''};
    }
    handleSubmit=(event)=>{

        let baseUrl = 'http://localhost:9090/user';
        const store ={_id:this.state._id,name:this.state.name,salary:this.state.salary};
       const response=  axios.post(baseUrl ,store)
        .then((response)=>this.setState({response}))
        .catch((err)=>console.log(err));
        console.log(response);
        event.preventDefault();
    }
    handleChange=(event)=>{
        this.setState({[event.target.name]:event.target.value})
    }
    render() {
        return (<div>
            <h3>Employee Store Form : </h3>
            <form onSubmit = {this.handleSubmit}>
                <div className='input-group mb-3'>
                <span className='input-group-text'>
                    Id : </span><input type = 'number' name = '_id' autoComplete = 'off' 
                    onChange = {this.handleChange}/>
                </div>
                <br />
                <div className='input-group mb-3'>
                <span className='input-group-text'>
                    Name : </span><input type = 'text' name = 'name' autoComplete = 'off'  
                    onChange = {this.handleChange}/>
                
                </div>
                <br />
                <div className='input-group mb-3'>
                <span className='input-group-text'>
                    Salary  : </span> <input type = 'number' name = 'salary' autoComplete = 'off'  
                    onChange = {this.handleChange}/>
               
                </div>
                <br />
                <button type = 'submit' className = 'btn btn-outline-primary'>Submit</button>
            </form>
            <div >
               <span className='input-group-text'>Id: {this.state._id}, Name: {this.state.name}, Salary: {this.state.salary}</span> 
            </div>
        </div>)
    }
}
export class EmployeeUpdate extends React.Component{
    constructor(props)
    {
        super(props);
        this.state = {_id:'', name:'', salary:''};
    }
    handleSubmit=(event)=>{

        let baseUrl = `http://localhost:9090/user/${this.state._id}/${this.state.name}/${this.state.salary}`;
      //  const store ={_id:this.state._id,name:this.state.name,salary:this.state.salary};
       const response=  axios.put(baseUrl)
        .then((response)=>this.setState({response}))
        .catch((err)=>console.log(err));
        console.log(response);
        event.preventDefault();
    }
    handleChange=(event)=>{
        this.setState({[event.target.name]:event.target.value})
    }
    render() {
        return (<div>
            <h3>Employee Update Form : </h3>
            <form onSubmit = {this.handleSubmit}>
                <div className='input-group mb-3'>
                <span className='input-group-text'>
                    Id : </span><input type = 'number' name = '_id' autoComplete = 'off' 
                    onChange = {this.handleChange}/>
                </div>
                <br />
                <div className='input-group mb-3'>
                <span className='input-group-text'>
                    Name : </span><input type = 'text' name = 'name' autoComplete = 'off'  
                    onChange = {this.handleChange}/>
                
                </div>
                <br />
                <div className='input-group mb-3'>
                <span className='input-group-text'>
                    Salary  : </span> <input type = 'number' name = 'salary' autoComplete = 'off'  
                    onChange = {this.handleChange}/>
               
                </div>
                <br />
                <button type = 'submit' className = 'btn btn-outline-primary'>Submit</button>
            </form>
            <div >
               <span className='input-group-text'>Id: {this.state._id}, Name: {this.state.name}, Salary: {this.state.salary}</span> 
            </div>
        </div>)
    }
}