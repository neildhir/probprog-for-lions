# Interpreting Lion Behaviour with Nonparametric Probabilistic Programs 

We consider the problem of unsupervised learning of meaningful behavioural segments of high-dimensional time-series observations, collected from a pride of African lions.  We demonstrate, by way of a probabilistic programming system (PPS), a methodology which allows for quick iteration over models and Bayesian inferences, which enables us to learn meaningful behavioural segments.  We introduce a new Bayesian nonparametric (BNP) state-space model, which extends the hierarchical Dirichlet process (HDP) hidden Markov model (HMM) with an explicit BNP treatment of duration distributions, to deal with different levels of granularity of the latent behavioural space of the lions. The ease with which this is done exemplifies the flexibility that a PPS gives a scientist. Furthermore, we combine this approach with unsupervised feature learning, using variational autoencoders.

[Neil Dhir](http://ori.ox.ac.uk/), [Matthijs Vakar](http://users.ox.ac.uk/~magd3996/), [Matthew Wijers](https://www.wildcru.org/members/mr-matthew-wijers/), 
[Andrew Markham](http://www.cs.ox.ac.uk/people/andrew.markham/), 
[Frank Wood](http://www.robots.ox.ac.uk/~fwood/), 
Paul Trethowan, Byron Du Preez, Andrew Loveridge, David MacDonald


["Hierarchical Attentive Recurrent Tracking", arXiv preprint, arxiv:1706.09262](https://arxiv.org/abs/1706.09262).

* **Corresponding authors**: 
    *[Neil Dhir](neild@robots.ox.ac.uk), Oxford Robotics Institue & Machine Learning Research Group, University of Oxford
    *[Matthijs Vakar](matthijs.vakar@cs.ox.ac.uk), Quantum Group, University of Oxford

## Installation
Install [Tensorflow v1.1](https://www.tensorflow.org/versions/r1.1/install/) and the following dependencies
 (using `pip install -r requirements.txt` (preferred) or `pip install [package]`):
* matplotlib==1.5.3
* numpy==1.12.1
* pandas==0.18.1
* scipy==0.18.1
