# DesignPatternFinals

The tweets and emotions(the part after '#') portrayed by each user is taken as two separate entities.
Each user has his own set of followers which are hardcoded and they can 'react' to either a person's tweet or his emotions as that would be the case in the real world. I have not restricted the emotions to any set because of the same reason.Since the followers of the user are hardcoded they are notified by print statements. For example if @sachin tweets "happyindia" with his emotion "#happy" you can react to his tweet i.e. "happyindia" or emotion i.e "#happy" regardless of your emotion matching his emotion or not because that's how twitter works.In the end 'calculate' function in reaction class calculates which users had the most reactions to their tweet and which users had the most reactions to their emotions.
