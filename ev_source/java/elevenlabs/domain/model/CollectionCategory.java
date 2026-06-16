package io.elevenlabs.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/model/CollectionCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Blog", "Curated", "Dynamic", "Feed", "Newsletter", "Series", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CollectionCategory[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CollectionCategory Blog = new CollectionCategory("Blog", 0);
    public static final CollectionCategory Curated = new CollectionCategory("Curated", 1);
    public static final CollectionCategory Dynamic = new CollectionCategory("Dynamic", 2);
    public static final CollectionCategory Feed = new CollectionCategory("Feed", 3);
    public static final CollectionCategory Newsletter = new CollectionCategory("Newsletter", 4);
    public static final CollectionCategory Series = new CollectionCategory("Series", 5);

    private static final /* synthetic */ CollectionCategory[] $values() {
        return new CollectionCategory[]{Blog, Curated, Dynamic, Feed, Newsletter, Series};
    }

    static {
        CollectionCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private CollectionCategory(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CollectionCategory valueOf(String str) {
        return (CollectionCategory) Enum.valueOf(CollectionCategory.class, str);
    }

    public static CollectionCategory[] values() {
        return (CollectionCategory[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/model/CollectionCategory$Companion;", "", "<init>", "()V", "fromString", "Lio/elevenlabs/domain/model/CollectionCategory;", "value", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final CollectionCategory fromString(String value) {
            if (value != null) {
                switch (value.hashCode()) {
                    case -905838985:
                        if (value.equals("series")) {
                            return CollectionCategory.Series;
                        }
                        break;
                    case 3026850:
                        if (value.equals("blog")) {
                            return CollectionCategory.Blog;
                        }
                        break;
                    case 3138974:
                        if (value.equals("feed")) {
                            return CollectionCategory.Feed;
                        }
                        break;
                    case 1102578873:
                        if (value.equals("newsletter")) {
                            return CollectionCategory.Newsletter;
                        }
                        break;
                    case 1126447698:
                        if (value.equals("curated")) {
                            return CollectionCategory.Curated;
                        }
                        break;
                    case 2124767295:
                        if (value.equals("dynamic")) {
                            return CollectionCategory.Dynamic;
                        }
                        break;
                }
            }
            return CollectionCategory.Curated;
        }

        private Companion() {
        }
    }
}
