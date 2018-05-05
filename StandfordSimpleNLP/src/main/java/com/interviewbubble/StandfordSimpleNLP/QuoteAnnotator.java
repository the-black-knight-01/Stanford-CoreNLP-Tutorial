package com.interviewbubble.StandfordSimpleNLP;

import java.io.*;
import java.util.*;

import edu.stanford.nlp.coref.CorefCoreAnnotations.CorefChainAnnotation;
import edu.stanford.nlp.io.*;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.trees.TreeCoreAnnotations.*;
import edu.stanford.nlp.semgraph.*;
import edu.stanford.nlp.ling.CoreAnnotations.*;
import edu.stanford.nlp.util.*;


public class QuoteAnnotator {

	public static void main (String[] args) throws IOException {
        // build pipeline
        Properties props = new Properties();
        props.setProperty("annotators","tokenize, ssplit, quote");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        String text = "\"Stanford University\" is located in California. It is a great university, founded in 1891.";
        Annotation annotation = new Annotation(text);
        pipeline.annotate(annotation);
        System.out.println(annotation.get(CoreAnnotations.QuotationsAnnotation.class));
        //CorefChainAnnotation o;
    }
}