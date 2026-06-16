package io.elevenlabs.readerapp.ui.components.explore;

import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;", "", "Lh5/h;", "size", "<init>", "(Ljava/lang/String;IJ)V", "J", "getSize-MYxV2XQ", "()J", "XSmall", "Small", "Compact", "Medium", "Large", "XLarge", "Square", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BookCoverSize {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ BookCoverSize[] $VALUES;
    public static final BookCoverSize Compact;
    public static final BookCoverSize Square;
    public static final BookCoverSize XSmall;
    private final long size;
    public static final BookCoverSize Small = new BookCoverSize("Small", 1, us.g.a(72, 108));
    public static final BookCoverSize Medium = new BookCoverSize("Medium", 3, us.g.a(120, SensibleDefaults.X_OFFSET));
    public static final BookCoverSize Large = new BookCoverSize("Large", 4, us.g.a(173, 260));
    public static final BookCoverSize XLarge = new BookCoverSize("XLarge", 5, us.g.a(220, 330));

    private static final /* synthetic */ BookCoverSize[] $values() {
        return new BookCoverSize[]{XSmall, Small, Compact, Medium, Large, XLarge, Square};
    }

    static {
        float f10 = 96;
        XSmall = new BookCoverSize("XSmall", 0, us.g.a(64, f10));
        Compact = new BookCoverSize("Compact", 2, us.g.a(f10, 144));
        float f11 = 192;
        Square = new BookCoverSize("Square", 6, us.g.a(f11, f11));
        BookCoverSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private BookCoverSize(String str, int i10, long j4) {
        this.size = j4;
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static BookCoverSize valueOf(String str) {
        return (BookCoverSize) Enum.valueOf(BookCoverSize.class, str);
    }

    public static BookCoverSize[] values() {
        return (BookCoverSize[]) $VALUES.clone();
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }
}
