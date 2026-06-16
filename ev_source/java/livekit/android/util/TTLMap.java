package io.livekit.android.util;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ho.a;
import io.c;
import io.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u000289B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00172\u0014\u0010\u001d\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R&\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010%0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R&\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.0-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Lio/livekit/android/util/TTLMap;", TokenNames.K, TokenNames.V, "", "Lxq/b;", "ttl", "Lkotlin/Function0;", "", "clock", "<init>", "(JLho/a;Lkotlin/jvm/internal/f;)V", "getNow", "()J", SubscriberAttributeKt.JSON_NAME_KEY, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "isEmpty", "()Z", "Lsn/z;", SDPKeywords.CLEAR, "()V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", Constants.MessagePayloadKeys.FROM, "putAll", "(Ljava/util/Map;)V", "remove", "cleanup", "J", "getTtl-UwyO8pc", "Lho/a;", "Lio/livekit/android/util/TTLMap$TTLItem;", "map", "Ljava/util/Map;", "lastCleanup", "", "getSize", "()I", "size", "", "", "getEntries", "()Ljava/util/Set;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "getKeys", UserMetadata.KEYDATA_FILENAME, "", "getValues", "()Ljava/util/Collection;", "values", "MutableEntry", "TTLItem", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TTLMap<K, V> implements Map<K, V>, d {
    private final a clock;
    private final long lastCleanup;
    private final Map<K, TTLItem<V>> map;
    private final long ttl;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", TokenNames.K, TokenNames.V, "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.livekit.android.util.TTLMap$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends n implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // ho.a
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lio/livekit/android/util/TTLMap$TTLItem;", TokenNames.V, "", "value", "expiresAt", "", "(Ljava/lang/Object;J)V", "getExpiresAt", "()J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lio/livekit/android/util/TTLMap$TTLItem;", "equals", "", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class TTLItem<V> {
        private final long expiresAt;
        private final V value;

        public TTLItem(V v9, long j4) {
            this.value = v9;
            this.expiresAt = j4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TTLItem copy$default(TTLItem tTLItem, Object obj, long j4, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = tTLItem.value;
            }
            if ((i10 & 2) != 0) {
                j4 = tTLItem.expiresAt;
            }
            return tTLItem.copy(obj, j4);
        }

        public final V component1() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final long getExpiresAt() {
            return this.expiresAt;
        }

        public final TTLItem<V> copy(V value, long expiresAt) {
            return new TTLItem<>(value, expiresAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TTLItem)) {
                return false;
            }
            TTLItem tTLItem = (TTLItem) other;
            if (m.c(this.value, tTLItem.value) && this.expiresAt == tTLItem.expiresAt) {
                return true;
            }
            return false;
        }

        public final long getExpiresAt() {
            return this.expiresAt;
        }

        public final V getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode;
            V v9 = this.value;
            if (v9 == null) {
                hashCode = 0;
            } else {
                hashCode = v9.hashCode();
            }
            return Long.hashCode(this.expiresAt) + (hashCode * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TTLItem(value=");
            sb.append(this.value);
            sb.append(", expiresAt=");
            return b.m(sb, this.expiresAt, ')');
        }
    }

    private TTLMap(long j4, a aVar) {
        aVar.getClass();
        this.ttl = j4;
        this.clock = aVar;
        this.map = new LinkedHashMap();
        this.lastCleanup = getNow();
    }

    private final long getNow() {
        return ((Number) this.clock.invoke()).longValue();
    }

    public final void cleanup() {
        long now = getNow();
        Iterator<Map.Entry<K, TTLItem<V>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().getExpiresAt() < now) {
                it.remove();
            }
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        if (get(key) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object key) {
        TTLItem<V> tTLItem = this.map.get(key);
        if (tTLItem == null) {
            return null;
        }
        if (tTLItem.getExpiresAt() < getNow()) {
            this.map.remove(key);
            return null;
        }
        return tTLItem.getValue();
    }

    public Set<Map.Entry<K, V>> getEntries() {
        cleanup();
        Set<Map.Entry<K, TTLItem<V>>> entrySet = this.map.entrySet();
        ArrayList arrayList = new ArrayList(p.a0(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new MutableEntry(entry.getKey(), ((TTLItem) entry.getValue()).getValue()));
        }
        return o.k1(arrayList);
    }

    public Set<K> getKeys() {
        cleanup();
        return this.map.keySet();
    }

    public int getSize() {
        cleanup();
        return this.map.size();
    }

    /* renamed from: getTtl-UwyO8pc, reason: not valid java name and from getter */
    public final long getTtl() {
        return this.ttl;
    }

    public Collection<V> getValues() {
        cleanup();
        Collection<TTLItem<V>> values = this.map.values();
        ArrayList arrayList = new ArrayList(p.a0(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((TTLItem) it.next()).component1());
        }
        return new ArrayList(arrayList);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        cleanup();
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        long now = getNow();
        long i10 = xq.b.i(this.ttl, xq.d.MILLISECONDS);
        if (now - this.lastCleanup > i10 / 2) {
            cleanup();
        }
        this.map.put(key, new TTLItem<>(value, now + i10));
        return value;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        from.getClass();
        for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(Object key) {
        TTLItem<V> remove = this.map.remove(key);
        if (remove != null) {
            return remove.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00022\b\b\u0002\u0010\u0005\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0015\u0010\u000b\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\u00028\u0003X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lio/livekit/android/util/TTLMap$MutableEntry;", TokenNames.K, TokenNames.V, "", SubscriberAttributeKt.JSON_NAME_KEY, "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "(Ljava/lang/Object;)V", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lio/livekit/android/util/TTLMap$MutableEntry;", "equals", "", "other", "", "hashCode", "", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class MutableEntry<K, V> implements Map.Entry<K, V>, c {
        private final K key;
        private V value;

        public MutableEntry(K k4, V v9) {
            this.key = k4;
            this.value = v9;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableEntry copy$default(MutableEntry mutableEntry, Object obj, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                obj = mutableEntry.key;
            }
            if ((i10 & 2) != 0) {
                obj2 = mutableEntry.value;
            }
            return mutableEntry.copy(obj, obj2);
        }

        public final K component1() {
            return this.key;
        }

        public final V component2() {
            return this.value;
        }

        public final MutableEntry<K, V> copy(K key, V value) {
            return new MutableEntry<>(key, value);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MutableEntry)) {
                return false;
            }
            MutableEntry mutableEntry = (MutableEntry) other;
            if (m.c(this.key, mutableEntry.key) && m.c(this.value, mutableEntry.value)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k4 = this.key;
            int i10 = 0;
            if (k4 == null) {
                hashCode = 0;
            } else {
                hashCode = k4.hashCode();
            }
            int i11 = hashCode * 31;
            V v9 = this.value;
            if (v9 != null) {
                i10 = v9.hashCode();
            }
            return i11 + i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            V value = getValue();
            setValue((MutableEntry<K, V>) newValue);
            return value;
        }

        public String toString() {
            return "MutableEntry(key=" + this.key + ", value=" + this.value + ')';
        }

        @Override // java.util.Map.Entry
        public void setValue(V v9) {
            this.value = v9;
        }
    }

    public /* synthetic */ TTLMap(long j4, a aVar, f fVar) {
        this(j4, aVar);
    }

    public /* synthetic */ TTLMap(long j4, a aVar, int i10, f fVar) {
        this(j4, (i10 & 2) != 0 ? AnonymousClass1.INSTANCE : aVar, null);
    }
}
