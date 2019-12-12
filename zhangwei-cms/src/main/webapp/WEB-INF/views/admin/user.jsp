<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="/public/css/bootstrap.min.css" rel="stylesheet">
<link href="/public/css/cms.css" rel="stylesheet">
<form class="form-inline">
<div class="form-group mx-sm-3 mb-2">
<input type="text" name="name" class="form-control" placeholder="请输入登录名"/>
</div>

<div class="form-group mx-sm-3 mb-2">
<input type="text" name="nickname" class="from-control" placeholder="请输入昵称"/>
</div>

<button type="button" class="btn btn-primary mb-2" onclick="query()">查询</button>
</form>
<table class="table">
<thead>
<tr>
	<th scope="col">#</th>
	<th scope="col">First</th>
	<th scope="col">Last</th>
	<th scope="col">Handle</th>
	<th scope="col">操作</th>
</tr>
</thead>
<tbody>
<tr>
<th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>
      	<button type="button" class="btn btn-primary">修改</button>
      </td>
</tr>
<tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
      <td>
      	<button type="button" class="btn btn-primary">修改</button>
      </td>
</tr>
<tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
      <td>
      	<button type="button" class="btn btn-primary">修改</button>
      </td>
</tr>
</tbody>
</table>
<div class="row">
<nav aria-label="Page navigation example col-5" style="margin-right: 10px;">
		<button type="button" class="btn btn-primary">添加</button>
		<button type="button" class="btn btn-primary">批删</button>
</nav>
<nav aria-label="Page navigation">
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
</div>
<script>
function query(){
	var params=$("form").serialize();
	reload(params);

}

</script>

