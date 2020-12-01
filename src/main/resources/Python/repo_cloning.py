import json
import os
import re

import pygit2 as git


def repo_cloning(filenameInput: str, pathOutput: str) -> None:
    with open(filenameInput) as fh:
        articles = json.load(fh)

    article_urls = [article['html_url'] for article in articles]

    i = 0
    for link in article_urls:
        i += 1

        # out = link.rsplit('/', 1)[-1].replace('.git', '')
        out = re.sub('https://github.com/', '', link).replace('/', '-')

        if os.path.isdir(pathOutput + '/' + out):
            print(str(i) + ') Already cloned', link)

            continue

        else:
            print(str(i) + ') Cloning ' + link)
            try:
                git.clone_repository(link, pathOutput + '/' + out)
            except Exception as e:
                print('[Error] cloning repository:', str(e))
                continue
