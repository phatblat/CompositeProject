# Android Composite Project

Companion project for [Gradle isn't just a Bad Word](https://360andev.com/session/gradle-isnt-just-a-bad-word/)
talk from [360|AnDev 2021](https://360andev.com/)

## 🎥 Slides

- [Slides](presentation.pdf)

## 🐚 Shell Function

<details>
<summary>Bash & Z Shell</summary>
<p>

#### Place this in .bashrc or .zshrc

```bash
function gw {
    if [ -e ./gradlew ]; then
        ./gradlew $argv
        return
    fi

    echo "There is no Gradle wrapper in the current dir."
    gradle $argv
}
```

</p>
</details>

<details>
<summary>Fish Shell</summary>
<p>

#### Place this in a file named `gw.fish` and save in `~/.config/fish/functions`

```bash
function gw
    if test -e ./gradlew
        ./gradlew $argv
        return
    end

    echo "There is no Gradle wrapper in the current dir."
    gradle $argv
end
```

</p>
</details>

## 📄 License

This repo is licensed under the MIT License.
See the [LICENSE](LICENSE.md) file for rights and limitations.
