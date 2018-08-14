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
                        <router-link to="/showAccounts">Show Accounts</router-link>
                        <router-link to="/addAccounts">Add Account</router-link>
                    </ul>
                </div>
            </div>
        </nav>

    </header>

    <main>
        <div class="box">
            <h1>Dashboard</h1>
            <p>Welcome to the dashboard of Account App.</p>
            <p>Please use the menu above to navigate through the app.</p>
        </div>
    </main>

</body>


  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
    methods: {
        navigate() {
            router.push({ name: "addAccounts" });
         }
     },
     methods: {
         navigate2() {
             router.push({ name: "showAccounts" });
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
