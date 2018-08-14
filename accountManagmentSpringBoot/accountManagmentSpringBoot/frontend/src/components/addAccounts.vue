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
            <h1>Add accounts</h1>

            <form action="">

                <input type="text" name="firstname" placeholder="First name" value="">
                <br>
                <input type="text" name="lastname" placeholder="Last name" value="">
                <br>
                <input type="text" name="firstname" placeholder="Account number" value="">
                <br>
                <input type="submit" class="submit" value="Submit">
              </form>

        </div>
    </main>

</body>


  </div>
</template>

<script>
export default {
  name: 'addAccounts',
  data () {
    return {
      msg: 'add accounts page'
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
