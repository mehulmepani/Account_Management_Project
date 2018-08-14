<template>
  <div class="hello">
<body>

    <header>

        <nav>
            <div class="box">
                <div class="nav-wrapper">
                    <a href="index.html" class="brand-logo">Account App</a>
                    <ul class="menu">
                        <li><a href="index.html">Dashboard</a></li>
                        <li><a href="showaccounts.html">Show Accounts</a></li>
                        <li><a href="addaccounts.html">Add Accounts</a></li>
                    </ul>
                </div>
            </div>
        </nav>

    </header>

    <main>
        <div class="box">
            <h1>Show accounts</h1>

            <table>
                <tr>
                    <th>ID</th>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Account number</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>Mehul</td>
                    <td>Mep</td>
                    <td>12345678</td>
                    <td><i class="far fa-edit"></i></td>
                    <td><i class="far fa-trash-alt"></i></td>
                </tr>
            </table>

        </div>
    </main>

</body>


  </div>
</template>

<script>
export default {
  name: 'showAccounts',
  data () {
    return {
      msg: 'Show Accounts'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
body { margin: 0; font-family: 'Roboto', sans-serif; }
h1 { font-size: 34px; }
.box { max-width: 1200px; margin: 0 auto; }
nav { background: #43b1ff; padding: 10px 0; box-shadow: 0 2px 2px 0 rgba(0,0,0,0.14), 0 3px 1px -2px rgba(0,0,0,0.12), 0 1px 5px 0 rgba(0,0,0,0.2); }
.nav-wrapper { display: flex; justify-content: space-between; align-items: center; }
.brand-logo { color: white; text-decoration: none; font-size: 34px; }

.menu { display: flex; flex-direction: row; }
.menu li { list-style: none; padding: 0 10px; }
.menu li a { color: white; text-decoration: none; }

table { border-collapse: collapse; width: 100%; }
th, td { text-align: left; padding: 8px;  }
tr:nth-child(even){ background-color: #f2f2f2}
th { background-color: #43b1ff; color: white; font-weight: 300; }

form input { -webkit-appearance: none; background: #43b1ff17; padding: 10px 20px; border: 0; margin-bottom: 20px; }
form .submit { background: #43b1ff; color: white; }
</style>
