# Interpreting Lion Behaviour with Nonparametric Probabilistic Programs 

We consider the problem of unsupervised learning of meaningful behavioural segments of high-dimensional time-series observations, collected from a pride of African lions.  We demonstrate, by way of a probabilistic programming system (PPS), a methodology which allows for quick iteration over models and Bayesian inferences, which enables us to learn meaningful behavioural segments.  We introduce a new Bayesian nonparametric (BNP) state-space model, which extends the hierarchical Dirichlet process (HDP) hidden Markov model (HMM) with an explicit BNP treatment of duration distributions, to deal with different levels of granularity of the latent behavioural space of the lions. The ease with which this is done exemplifies the flexibility that a PPS gives a scientist. Furthermore, we combine this approach with unsupervised feature learning, using variational autoencoders.

![Alt text](,/activity-plot.pdf?raw=true "Detailed analysis of hunting segment using BNP SSM models.")

[Neil Dhir](http://ori.ox.ac.uk/), [Matthijs Vakar](http://users.ox.ac.uk/~magd3996/), [Matthew Wijers](https://www.wildcru.org/members/mr-matthew-wijers/), 
[Andrew Markham](http://www.cs.ox.ac.uk/people/andrew.markham/), 
[Frank Wood](http://www.robots.ox.ac.uk/~fwood/), 
Paul Trethowan, Byron Du Preez, Andrew Loveridge, David MacDonald; ["Interpreting Lion Behaviour with Nonparametric Probabilistic Programs
"](http://www.auai.org/uai2017/accepted.php).

**Corresponding authors**:

* [Neil Dhir](neild@robots.ox.ac.uk), Oxford Robotics Institue & Machine Learning Research Group, University of Oxford
* [Matthijs Vakar](matthijs.vakar@cs.ox.ac.uk), Quantum Group, University of Oxford

## Installation & Demo

There are number of dependencies to install, in order to explore the nonparametric probabilistic programs which we present:

* First you need to install Anglican, do that by following the instructions [here](http://www.robots.ox.ac.uk/~fwood/anglican/)
* Secondly, clone this repo and navigate to `demo/examples.clj`
* Therein, run the web-based clojure notebook, by typing (in a terminal) `lein gorilla examples.clj` 

Apart from the required clojure libraries, this is a self-contained repo where all the necessary functions are specified in the `examples.clj` notebook.

## Citation

If you find this repo useful in your research, please consider citing our work:

    @inproceedings{dhir2017interpreting,
        title={Interpreting Lion Behaviour with Nonparametric Probabilistic Programs} 
        author={Dhir, Neil and V{\'{a}}k{\'{a}}r, Matthijs and Wijers, Matthew and Markham, Andrew and Wood, Frank and Trethowan, Paul and Du Preez, Byron and Loveridge, Andrew and MacDonald, David},
        booktitle={UAI},
        year={2017}
    }


## License

This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see  <http://www.gnu.org/licenses/>.
