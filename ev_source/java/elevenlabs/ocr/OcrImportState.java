package io.elevenlabs.ocr;

import android.gov.nist.core.Separators;
import android.net.Uri;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017¨\u0006+"}, d2 = {"Lio/elevenlabs/ocr/OcrImportState;", "", "permissionGranted", "", "images", "", "Landroid/net/Uri;", "selectedImage", "isLoading", "navigateToRead", "Lio/elevenlabs/domain/model/ReadMeta;", "navigateToAddPodcastLimitReached", "Lio/elevenlabs/domain/model/LimitReachedData;", "isPodcastMode", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Landroid/net/Uri;ZLio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/LimitReachedData;Z)V", "getPermissionGranted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImages", "()Ljava/util/List;", "getSelectedImage", "()Landroid/net/Uri;", "()Z", "getNavigateToRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getNavigateToAddPodcastLimitReached", "()Lio/elevenlabs/domain/model/LimitReachedData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Landroid/net/Uri;ZLio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/LimitReachedData;Z)Lio/elevenlabs/ocr/OcrImportState;", "equals", "other", "hashCode", "", "toString", "", "ocr_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OcrImportState {
    public static final int $stable = 8;
    private final List<Uri> images;
    private final boolean isLoading;
    private final boolean isPodcastMode;
    private final LimitReachedData navigateToAddPodcastLimitReached;
    private final ReadMeta navigateToRead;
    private final Boolean permissionGranted;
    private final Uri selectedImage;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OcrImportState(Boolean bool, List list, Uri uri, boolean z6, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, int i10, kotlin.jvm.internal.f fVar) {
        this(bool, list, uri, z6, readMeta, limitReachedData, r10);
        boolean z11;
        bool = (i10 & 1) != 0 ? null : bool;
        list = (i10 & 2) != 0 ? tn.t.f33547a : list;
        uri = (i10 & 4) != 0 ? null : uri;
        z6 = (i10 & 8) != 0 ? false : z6;
        readMeta = (i10 & 16) != 0 ? null : readMeta;
        limitReachedData = (i10 & 32) != 0 ? null : limitReachedData;
        if ((i10 & 64) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
    }

    public static /* synthetic */ OcrImportState copy$default(OcrImportState ocrImportState, Boolean bool, List list, Uri uri, boolean z6, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = ocrImportState.permissionGranted;
        }
        if ((i10 & 2) != 0) {
            list = ocrImportState.images;
        }
        if ((i10 & 4) != 0) {
            uri = ocrImportState.selectedImage;
        }
        if ((i10 & 8) != 0) {
            z6 = ocrImportState.isLoading;
        }
        if ((i10 & 16) != 0) {
            readMeta = ocrImportState.navigateToRead;
        }
        if ((i10 & 32) != 0) {
            limitReachedData = ocrImportState.navigateToAddPodcastLimitReached;
        }
        if ((i10 & 64) != 0) {
            z10 = ocrImportState.isPodcastMode;
        }
        LimitReachedData limitReachedData2 = limitReachedData;
        boolean z11 = z10;
        ReadMeta readMeta2 = readMeta;
        Uri uri2 = uri;
        return ocrImportState.copy(bool, list, uri2, z6, readMeta2, limitReachedData2, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getPermissionGranted() {
        return this.permissionGranted;
    }

    public final List<Uri> component2() {
        return this.images;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getSelectedImage() {
        return this.selectedImage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    /* renamed from: component6, reason: from getter */
    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPodcastMode() {
        return this.isPodcastMode;
    }

    public final OcrImportState copy(Boolean permissionGranted, List<? extends Uri> images, Uri selectedImage, boolean isLoading, ReadMeta navigateToRead, LimitReachedData navigateToAddPodcastLimitReached, boolean isPodcastMode) {
        images.getClass();
        return new OcrImportState(permissionGranted, images, selectedImage, isLoading, navigateToRead, navigateToAddPodcastLimitReached, isPodcastMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcrImportState)) {
            return false;
        }
        OcrImportState ocrImportState = (OcrImportState) other;
        if (kotlin.jvm.internal.m.c(this.permissionGranted, ocrImportState.permissionGranted) && kotlin.jvm.internal.m.c(this.images, ocrImportState.images) && kotlin.jvm.internal.m.c(this.selectedImage, ocrImportState.selectedImage) && this.isLoading == ocrImportState.isLoading && kotlin.jvm.internal.m.c(this.navigateToRead, ocrImportState.navigateToRead) && kotlin.jvm.internal.m.c(this.navigateToAddPodcastLimitReached, ocrImportState.navigateToAddPodcastLimitReached) && this.isPodcastMode == ocrImportState.isPodcastMode) {
            return true;
        }
        return false;
    }

    public final List<Uri> getImages() {
        return this.images;
    }

    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    public final Boolean getPermissionGranted() {
        return this.permissionGranted;
    }

    public final Uri getSelectedImage() {
        return this.selectedImage;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Boolean bool = this.permissionGranted;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int d10 = p.n.d(hashCode * 31, 31, this.images);
        Uri uri = this.selectedImage;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((d10 + hashCode2) * 31, 31, this.isLoading);
        ReadMeta readMeta = this.navigateToRead;
        if (readMeta == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = readMeta.hashCode();
        }
        int i11 = (f10 + hashCode3) * 31;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        if (limitReachedData != null) {
            i10 = limitReachedData.hashCode();
        }
        return Boolean.hashCode(this.isPodcastMode) + ((i11 + i10) * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPodcastMode() {
        return this.isPodcastMode;
    }

    public String toString() {
        Boolean bool = this.permissionGranted;
        List<Uri> list = this.images;
        Uri uri = this.selectedImage;
        boolean z6 = this.isLoading;
        ReadMeta readMeta = this.navigateToRead;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        boolean z10 = this.isPodcastMode;
        StringBuilder sb = new StringBuilder("OcrImportState(permissionGranted=");
        sb.append(bool);
        sb.append(", images=");
        sb.append(list);
        sb.append(", selectedImage=");
        sb.append(uri);
        sb.append(", isLoading=");
        sb.append(z6);
        sb.append(", navigateToRead=");
        sb.append(readMeta);
        sb.append(", navigateToAddPodcastLimitReached=");
        sb.append(limitReachedData);
        sb.append(", isPodcastMode=");
        return p.n.j(Separators.RPAREN, sb, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OcrImportState(Boolean bool, List<? extends Uri> list, Uri uri, boolean z6, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10) {
        list.getClass();
        this.permissionGranted = bool;
        this.images = list;
        this.selectedImage = uri;
        this.isLoading = z6;
        this.navigateToRead = readMeta;
        this.navigateToAddPodcastLimitReached = limitReachedData;
        this.isPodcastMode = z10;
    }

    public OcrImportState() {
        this(null, null, null, false, null, null, false, 127, null);
    }
}
