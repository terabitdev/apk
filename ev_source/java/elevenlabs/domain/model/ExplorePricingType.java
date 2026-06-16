package io.elevenlabs.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/model/ExplorePricingType;", "", "<init>", "(Ljava/lang/String;I)V", "Free", "Paid", "Ultra", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExplorePricingType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExplorePricingType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ExplorePricingType Free = new ExplorePricingType("Free", 0);
    public static final ExplorePricingType Paid = new ExplorePricingType("Paid", 1);
    public static final ExplorePricingType Ultra = new ExplorePricingType("Ultra", 2);

    private static final /* synthetic */ ExplorePricingType[] $values() {
        return new ExplorePricingType[]{Free, Paid, Ultra};
    }

    static {
        ExplorePricingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private ExplorePricingType(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ExplorePricingType valueOf(String str) {
        return (ExplorePricingType) Enum.valueOf(ExplorePricingType.class, str);
    }

    public static ExplorePricingType[] values() {
        return (ExplorePricingType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/model/ExplorePricingType$Companion;", "", "<init>", "()V", "fromString", "Lio/elevenlabs/domain/model/ExplorePricingType;", "value", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ExplorePricingType fromString(String value) {
            value.getClass();
            if (value.equals("paid")) {
                return ExplorePricingType.Paid;
            }
            if (value.equals("ultra")) {
                return ExplorePricingType.Ultra;
            }
            return ExplorePricingType.Free;
        }

        private Companion() {
        }
    }
}
