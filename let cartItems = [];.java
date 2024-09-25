let cartItems = [];

function addToCart(item) {
    cartItems.push(item);
    updateCart();
}

function updateCart() {
    const cart = document.getElementById('cart');
    cart.innerHTML = '<h2>Carrinho</h2>';
    if (cartItems.length === 0) {
        cart.innerHTML += '<p>O carrinho está vazio.</p>';
    } else {
        cartItems.forEach((item, index) => {
            cart.innerHTML += <p>${index + 1}. ${item}</p>;
        });
    }
}