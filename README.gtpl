# Cory Borek
Software Engineer and Computer Science Student

### GitHub Stats

<p align="left"><img src="https://raw.githubusercontent.com/CoryBorek/CoryBorek/main/github-metrics.svg" /></p>

### Recent Contributions
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### Latest Projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### Recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### Links:
  - Youtube        : <https://youtube.com/@agentdid127>
  - Twitch         : <https://twitch.tv/agentdid127>
  - Website        : <https://agentdid127.com>
  - LowToHighLevel : <https://youtube.com/@LowToHighLevel>
  - Notes Page     : <https://coryborek.github.io/notes/>
