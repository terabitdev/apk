package io.elevenlabs.data.cache;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/data/cache/ConcurrentHashMapMemoryCache;", "Lio/elevenlabs/data/cache/MemoryCache;", "<init>", "()V", "Lsn/z;", SDPKeywords.CLEAR, "", TokenNames.T, "", SubscriberAttributeKt.JSON_NAME_KEY, "value", "put", "(Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "", "containsKey", "(Ljava/lang/String;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConcurrentHashMapMemoryCache implements MemoryCache {
    private final ConcurrentHashMap<String, Object> cache = new ConcurrentHashMap<>();

    @Override // io.elevenlabs.data.cache.MemoryCache
    public void clear() {
        this.cache.clear();
    }

    @Override // io.elevenlabs.data.cache.MemoryCache
    public boolean containsKey(String key) {
        key.getClass();
        return this.cache.containsKey(key);
    }

    @Override // io.elevenlabs.data.cache.MemoryCache
    public <T> T get(String key) {
        key.getClass();
        T t10 = (T) this.cache.get(key);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // io.elevenlabs.data.cache.MemoryCache
    public <T> void put(String key, T value) {
        key.getClass();
        value.getClass();
        this.cache.put(key, value);
    }
}
