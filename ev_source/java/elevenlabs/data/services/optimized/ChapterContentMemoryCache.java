package io.elevenlabs.data.services.optimized;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.elevenlabs.domain.model.ChapterContent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0015j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/data/services/optimized/ChapterContentMemoryCache;", "", "<init>", "()V", "", "readId", "", "chapterIndex", SubscriberAttributeKt.JSON_NAME_KEY, "(Ljava/lang/String;I)Ljava/lang/String;", "Lio/elevenlabs/domain/model/ChapterContent;", "get", "(Ljava/lang/String;I)Lio/elevenlabs/domain/model/ChapterContent;", FirebaseAnalytics.Param.CONTENT, "Lsn/z;", "put", "(Ljava/lang/String;ILio/elevenlabs/domain/model/ChapterContent;)V", "clearForRead", "(Ljava/lang/String;)V", "maxEntries", TokenNames.I, "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Ljava/util/LinkedHashMap;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ChapterContentMemoryCache {
    private final int maxEntries = 32;
    private final LinkedHashMap<String, ChapterContent> entries = new LinkedHashMap<>(32, 0.75f, true);

    private static final boolean clearForRead$lambda$0(String str, String str2) {
        str2.getClass();
        return u.W(str2, str, false);
    }

    private final String key(String readId, int chapterIndex) {
        return readId + ":" + chapterIndex;
    }

    public final synchronized void clearForRead(String readId) {
        readId.getClass();
        String concat = readId.concat(":");
        Set<String> keySet = this.entries.keySet();
        keySet.getClass();
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            if (clearForRead$lambda$0(concat, (String) it.next())) {
                it.remove();
            }
        }
    }

    public final synchronized ChapterContent get(String readId, int chapterIndex) {
        readId.getClass();
        return this.entries.get(key(readId, chapterIndex));
    }

    public final synchronized void put(String readId, int chapterIndex, ChapterContent content) {
        readId.getClass();
        content.getClass();
        this.entries.put(key(readId, chapterIndex), content);
        while (this.entries.size() > this.maxEntries) {
            Iterator<Map.Entry<String, ChapterContent>> it = this.entries.entrySet().iterator();
            it.next();
            it.remove();
        }
    }
}
