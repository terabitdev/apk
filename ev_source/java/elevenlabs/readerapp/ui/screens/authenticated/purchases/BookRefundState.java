package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.BookRefundReason;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookRefundState;", "", "readId", "", "isLoading", "", "refundReason", "Lio/elevenlabs/domain/model/BookRefundReason;", "refundReasonText", "goBack", "<init>", "(Ljava/lang/String;ZLio/elevenlabs/domain/model/BookRefundReason;Ljava/lang/String;Z)V", "getReadId", "()Ljava/lang/String;", "()Z", "getRefundReason", "()Lio/elevenlabs/domain/model/BookRefundReason;", "getRefundReasonText", "getGoBack", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class BookRefundState {
    public static final int $stable = 0;
    private final boolean goBack;
    private final boolean isLoading;
    private final String readId;
    private final BookRefundReason refundReason;
    private final String refundReasonText;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BookRefundState(String str, boolean z6, BookRefundReason bookRefundReason, String str2, boolean z10, int i10, kotlin.jvm.internal.f fVar) {
        this(str, z6, bookRefundReason, str2, r8);
        boolean z11;
        str = (i10 & 1) != 0 ? null : str;
        z6 = (i10 & 2) != 0 ? false : z6;
        bookRefundReason = (i10 & 4) != 0 ? null : bookRefundReason;
        str2 = (i10 & 8) != 0 ? "" : str2;
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
    }

    public static /* synthetic */ BookRefundState copy$default(BookRefundState bookRefundState, String str, boolean z6, BookRefundReason bookRefundReason, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bookRefundState.readId;
        }
        if ((i10 & 2) != 0) {
            z6 = bookRefundState.isLoading;
        }
        if ((i10 & 4) != 0) {
            bookRefundReason = bookRefundState.refundReason;
        }
        if ((i10 & 8) != 0) {
            str2 = bookRefundState.refundReasonText;
        }
        if ((i10 & 16) != 0) {
            z10 = bookRefundState.goBack;
        }
        boolean z11 = z10;
        BookRefundReason bookRefundReason2 = bookRefundReason;
        return bookRefundState.copy(str, z6, bookRefundReason2, str2, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final BookRefundReason getRefundReason() {
        return this.refundReason;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRefundReasonText() {
        return this.refundReasonText;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getGoBack() {
        return this.goBack;
    }

    public final BookRefundState copy(String readId, boolean isLoading, BookRefundReason refundReason, String refundReasonText, boolean goBack) {
        refundReasonText.getClass();
        return new BookRefundState(readId, isLoading, refundReason, refundReasonText, goBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookRefundState)) {
            return false;
        }
        BookRefundState bookRefundState = (BookRefundState) other;
        if (kotlin.jvm.internal.m.c(this.readId, bookRefundState.readId) && this.isLoading == bookRefundState.isLoading && this.refundReason == bookRefundState.refundReason && kotlin.jvm.internal.m.c(this.refundReasonText, bookRefundState.refundReasonText) && this.goBack == bookRefundState.goBack) {
            return true;
        }
        return false;
    }

    public final boolean getGoBack() {
        return this.goBack;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final BookRefundReason getRefundReason() {
        return this.refundReason;
    }

    public final String getRefundReasonText() {
        return this.refundReasonText;
    }

    public int hashCode() {
        int hashCode;
        String str = this.readId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.isLoading);
        BookRefundReason bookRefundReason = this.refundReason;
        if (bookRefundReason != null) {
            i10 = bookRefundReason.hashCode();
        }
        return Boolean.hashCode(this.goBack) + j0.c.c((f10 + i10) * 31, 31, this.refundReasonText);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        String str = this.readId;
        boolean z6 = this.isLoading;
        BookRefundReason bookRefundReason = this.refundReason;
        String str2 = this.refundReasonText;
        boolean z10 = this.goBack;
        StringBuilder sb = new StringBuilder("BookRefundState(readId=");
        sb.append(str);
        sb.append(", isLoading=");
        sb.append(z6);
        sb.append(", refundReason=");
        sb.append(bookRefundReason);
        sb.append(", refundReasonText=");
        sb.append(str2);
        sb.append(", goBack=");
        return p.n.j(Separators.RPAREN, sb, z10);
    }

    public BookRefundState(String str, boolean z6, BookRefundReason bookRefundReason, String str2, boolean z10) {
        str2.getClass();
        this.readId = str;
        this.isLoading = z6;
        this.refundReason = bookRefundReason;
        this.refundReasonText = str2;
        this.goBack = z10;
    }

    public BookRefundState() {
        this(null, false, null, null, false, 31, null);
    }
}
