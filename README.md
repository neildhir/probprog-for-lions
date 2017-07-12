# Interpreting Lion Behaviour with Nonparametric Probabilistic Programs 

We consider the problem of unsupervised learning of meaningful behavioural segments of high-dimensional time-series observations, collected from a pride of African lions.  We demonstrate, by way of a probabilistic programming system (PPS), a methodology which allows for quick iteration over models and Bayesian inferences, which enables us to learn meaningful behavioural segments.  We introduce a new Bayesian nonparametric (BNP) state-space model, which extends the hierarchical Dirichlet process (HDP) hidden Markov model (HMM) with an explicit BNP treatment of duration distributions, to deal with different levels of granularity of the latent behavioural space of the lions. The ease with which this is done exemplifies the flexibility that a PPS gives a scientist. Furthermore, we combine this approach with unsupervised feature learning, using variational autoencoders.

[Neil Dhir](http://ori.ox.ac.uk/), [Matthijs Vakar](http://users.ox.ac.uk/~magd3996/), [Matthew Wijers](https://www.wildcru.org/members/mr-matthew-wijers/), 
[Andrew Markham](http://www.cs.ox.ac.uk/people/andrew.markham/), 
[Frank Wood](http://www.robots.ox.ac.uk/~fwood/), 
Paul Trethowan, Byron Du Preez, Andrew Loveridge, David MacDonald; ["Interpreting Lion Behaviour with Nonparametric Probabilistic Programs
"](http://www.auai.org/uai2017/accepted.php).

**Corresponding authors**:

* [Neil Dhir](neild@robots.ox.ac.uk), Oxford Robotics Institue & Machine Learning Research Group, University of Oxford
* [Matthijs Vakar](matthijs.vakar@cs.ox.ac.uk), Quantum Group, University of Oxford

## Installation

There are number of dependencies to install, in order to explore the nonparametric probabilistic programs which we present:

* First you need to install Anglican, do that by following the instructions [here](http://www.robots.ox.ac.uk/~fwood/anglican/)
* Secondly, clone this repo and navigate to `demo/examples.clj`
* Therein, run the web-based clojure notebook, by typing (in a terminal) `lein gorilla examples.clj` 
