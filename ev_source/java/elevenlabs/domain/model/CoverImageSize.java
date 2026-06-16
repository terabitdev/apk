package io.elevenlabs.domain.model;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/model/CoverImageSize;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Large", "Medium", "Thumbnail", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CoverImageSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CoverImageSize[] $VALUES;
    public static final CoverImageSize Large = new CoverImageSize("Large", 0, "large");
    public static final CoverImageSize Medium = new CoverImageSize("Medium", 1, "medium");
    public static final CoverImageSize Thumbnail = new CoverImageSize("Thumbnail", 2, "thumbnail");
    private final String key;

    private static final /* synthetic */ CoverImageSize[] $values() {
        return new CoverImageSize[]{Large, Medium, Thumbnail};
    }

    static {
        CoverImageSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private CoverImageSize(String str, int i10, String str2) {
        this.key = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CoverImageSize valueOf(String str) {
        return (CoverImageSize) Enum.valueOf(CoverImageSize.class, str);
    }

    public static CoverImageSize[] values() {
        return (CoverImageSize[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
