(ns fartgate.core
  (:require
   [cheshire.core :as json]
   [taoensso.timbre :as log])
  (:gen-class
   :implements [com.amazonaws.services.lambda.runtime.RequestStreamHandler]))

(defn ^:private parse-json
  "Convert the given object to a java.io.PushbackReader and parse as JSON."
  [maybe-reader]
  (json/parse-stream (io/reader maybe-reader) keyword))

(defn -handleRequest
  "Given a Lambda S3 event, finds all object puts in the event and sends diffs off
  somewhere."
  [this in-stream out-stream context]
  (let [parsed (-> in-stream parse-json log/spy)]
    parsed))
