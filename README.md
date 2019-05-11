# fartgate

Sometimes, your Fargate containers fail. For some reason it's really hard to
just alert on exit codes other than zero? But no more: fartgate will let you
know when one of your Fargate Tasks is stinking up the room.

It grabs events from CloudWatch Events, runs in a Lambda, and sends them to
wherever you want via [unsiemly][unsiemly].

## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar fartgate-0.1.0-standalone.jar [args]

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2019 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
