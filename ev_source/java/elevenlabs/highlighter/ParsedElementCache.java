package io.elevenlabs.highlighter;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\b\u0004*\u0001\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/highlighter/ParsedElementCache;", "", "<init>", "()V", "", "elementString", "Lsn/z;", "warmOne", "(Ljava/lang/String;)V", "Lorg/jsoup/nodes/k;", "get", "(Ljava/lang/String;)Lorg/jsoup/nodes/k;", "", "strings", "warm", "(Ljava/lang/Iterable;)V", "evict", SDPKeywords.CLEAR, "io/elevenlabs/highlighter/ParsedElementCache$cache$1", "cache", "Lio/elevenlabs/highlighter/ParsedElementCache$cache$1;", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ParsedElementCache {
    public static final ParsedElementCache INSTANCE = new ParsedElementCache();
    private static final ParsedElementCache$cache$1 cache = new ParsedElementCache$cache$1();
    public static final int $stable = 8;

    private ParsedElementCache() {
    }

    private final void warmOne(String elementString) {
        boolean containsKey;
        org.jsoup.nodes.k parseSingleElement;
        ParsedElementCache$cache$1 parsedElementCache$cache$1 = cache;
        synchronized (parsedElementCache$cache$1) {
            containsKey = parsedElementCache$cache$1.containsKey((Object) elementString);
        }
        if (containsKey || (parseSingleElement = HighlighterKt.parseSingleElement(elementString)) == null) {
            return;
        }
        synchronized (parsedElementCache$cache$1) {
            parsedElementCache$cache$1.put(elementString, parseSingleElement);
        }
    }

    public final void clear() {
        ParsedElementCache$cache$1 parsedElementCache$cache$1 = cache;
        synchronized (parsedElementCache$cache$1) {
            parsedElementCache$cache$1.clear();
        }
    }

    public final void evict(Iterable<String> strings) {
        strings.getClass();
        synchronized (cache) {
            Iterator<String> it = strings.iterator();
            while (it.hasNext()) {
                cache.remove((Object) it.next());
            }
        }
    }

    public final org.jsoup.nodes.k get(String elementString) {
        org.jsoup.nodes.k kVar;
        elementString.getClass();
        ParsedElementCache$cache$1 parsedElementCache$cache$1 = cache;
        synchronized (parsedElementCache$cache$1) {
            kVar = (org.jsoup.nodes.k) parsedElementCache$cache$1.get((Object) elementString);
        }
        if (kVar != null) {
            return kVar;
        }
        org.jsoup.nodes.k parseSingleElement = HighlighterKt.parseSingleElement(elementString);
        if (parseSingleElement == null) {
            return null;
        }
        synchronized (parsedElementCache$cache$1) {
            parsedElementCache$cache$1.put(elementString, parseSingleElement);
        }
        return parseSingleElement;
    }

    public final void warm(Iterable<String> strings) {
        strings.getClass();
        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            INSTANCE.warmOne(it.next());
        }
    }
}
