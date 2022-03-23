from urllib.request import Request, urlopen
from bs4 import BeautifulSoup
from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager

URL = "https://de.louisvuitton.com/deu-de/produkte/pochette-accessoires-nm-monogram-005656"


def extract_html(url):

    driver = webdriver.Firefox(executable_path=GeckoDriverManager().install())
    driver.get(url)
    html = driver.page_source

    # agent = {'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)'}
    # source = Request(url, headers=agent)
    # html = urlopen(source).read()

    return html

def extract_data(html):
    soup = BeautifulSoup(html, 'html.parser')
    # print(soup)
    # item_label = soup.find("button", {"class": "lv-product-purchase-button.lv-button -primary.lv-product-purchase__button -fullwidth"})
    item_label = soup.select("div.lv-product-purchase__price-stock")
    print(item_label)

extract_data(extract_html(URL))

