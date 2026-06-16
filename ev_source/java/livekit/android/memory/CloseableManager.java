package io.livekit.android.memory;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/livekit/android/memory/CloseableManager;", "Ljava/io/Closeable;", "<init>", "()V", "", SubscriberAttributeKt.JSON_NAME_KEY, "closer", "Lsn/z;", "registerResource", "(Ljava/lang/Object;Ljava/io/Closeable;)V", "closable", "registerClosable", "(Ljava/io/Closeable;)V", "unregisterResource", "(Ljava/lang/Object;)Ljava/io/Closeable;", "close", "", "isClosed", "Z", "", "resources", "Ljava/util/Map;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CloseableManager implements Closeable {
    private boolean isClosed;
    private final Map<Object, Closeable> resources = new LinkedHashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.isClosed = true;
            Iterator<T> it = this.resources.values().iterator();
            while (it.hasNext()) {
                ((Closeable) it.next()).close();
            }
            this.resources.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void registerClosable(Closeable closable) {
        closable.getClass();
        if (this.isClosed) {
            closable.close();
        } else {
            this.resources.put(closable, closable);
        }
    }

    public final synchronized void registerResource(Object key, Closeable closer) {
        key.getClass();
        closer.getClass();
        if (this.isClosed) {
            closer.close();
        } else {
            this.resources.put(key, closer);
        }
    }

    public final synchronized Closeable unregisterResource(Object key) {
        key.getClass();
        return this.resources.remove(key);
    }
}
