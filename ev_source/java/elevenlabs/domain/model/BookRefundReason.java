package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/domain/model/BookRefundReason;", "", "<init>", "(Ljava/lang/String;I)V", "NarratorDislike", "PoorAudioQuality", "ContentNotExpected", "StoryNotEnjoyed", "AccidentalPurchase", "AlreadyOwn", "WrongBook", "DifferentFormat", "WrongLanguage", "ChangedMind", "Other", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BookRefundReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BookRefundReason[] $VALUES;
    public static final BookRefundReason NarratorDislike = new BookRefundReason("NarratorDislike", 0);
    public static final BookRefundReason PoorAudioQuality = new BookRefundReason("PoorAudioQuality", 1);
    public static final BookRefundReason ContentNotExpected = new BookRefundReason("ContentNotExpected", 2);
    public static final BookRefundReason StoryNotEnjoyed = new BookRefundReason("StoryNotEnjoyed", 3);
    public static final BookRefundReason AccidentalPurchase = new BookRefundReason("AccidentalPurchase", 4);
    public static final BookRefundReason AlreadyOwn = new BookRefundReason("AlreadyOwn", 5);
    public static final BookRefundReason WrongBook = new BookRefundReason("WrongBook", 6);
    public static final BookRefundReason DifferentFormat = new BookRefundReason("DifferentFormat", 7);
    public static final BookRefundReason WrongLanguage = new BookRefundReason("WrongLanguage", 8);
    public static final BookRefundReason ChangedMind = new BookRefundReason("ChangedMind", 9);
    public static final BookRefundReason Other = new BookRefundReason("Other", 10);

    private static final /* synthetic */ BookRefundReason[] $values() {
        return new BookRefundReason[]{NarratorDislike, PoorAudioQuality, ContentNotExpected, StoryNotEnjoyed, AccidentalPurchase, AlreadyOwn, WrongBook, DifferentFormat, WrongLanguage, ChangedMind, Other};
    }

    static {
        BookRefundReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private BookRefundReason(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static BookRefundReason valueOf(String str) {
        return (BookRefundReason) Enum.valueOf(BookRefundReason.class, str);
    }

    public static BookRefundReason[] values() {
        return (BookRefundReason[]) $VALUES.clone();
    }
}
