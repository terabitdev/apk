package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/MediaCarouselItem;", "", "", "title", "subtitle", "accessibilityText", "backgroundImageUrl", "backgroundVideoUrl", "Lkotlin/Function0;", "Lsn/z;", "onItemClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/a;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lho/a;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/a;)Lio/elevenlabs/readerapp/ui/components/MediaCarouselItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getAccessibilityText", "getBackgroundImageUrl", "getBackgroundVideoUrl", "Lho/a;", "getOnItemClick", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MediaCarouselItem {
    public static final int $stable = 0;
    private final String accessibilityText;
    private final String backgroundImageUrl;
    private final String backgroundVideoUrl;
    private final ho.a onItemClick;
    private final String subtitle;
    private final String title;

    public MediaCarouselItem(String str, String str2, String str3, String str4, String str5, ho.a aVar) {
        str.getClass();
        str4.getClass();
        aVar.getClass();
        this.title = str;
        this.subtitle = str2;
        this.accessibilityText = str3;
        this.backgroundImageUrl = str4;
        this.backgroundVideoUrl = str5;
        this.onItemClick = aVar;
    }

    public static /* synthetic */ MediaCarouselItem copy$default(MediaCarouselItem mediaCarouselItem, String str, String str2, String str3, String str4, String str5, ho.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mediaCarouselItem.title;
        }
        if ((i10 & 2) != 0) {
            str2 = mediaCarouselItem.subtitle;
        }
        if ((i10 & 4) != 0) {
            str3 = mediaCarouselItem.accessibilityText;
        }
        if ((i10 & 8) != 0) {
            str4 = mediaCarouselItem.backgroundImageUrl;
        }
        if ((i10 & 16) != 0) {
            str5 = mediaCarouselItem.backgroundVideoUrl;
        }
        if ((i10 & 32) != 0) {
            aVar = mediaCarouselItem.onItemClick;
        }
        String str6 = str5;
        ho.a aVar2 = aVar;
        return mediaCarouselItem.copy(str, str2, str3, str4, str6, aVar2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccessibilityText() {
        return this.accessibilityText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final ho.a getOnItemClick() {
        return this.onItemClick;
    }

    public final MediaCarouselItem copy(String title, String subtitle, String accessibilityText, String backgroundImageUrl, String backgroundVideoUrl, ho.a onItemClick) {
        title.getClass();
        backgroundImageUrl.getClass();
        onItemClick.getClass();
        return new MediaCarouselItem(title, subtitle, accessibilityText, backgroundImageUrl, backgroundVideoUrl, onItemClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaCarouselItem)) {
            return false;
        }
        MediaCarouselItem mediaCarouselItem = (MediaCarouselItem) other;
        if (kotlin.jvm.internal.m.c(this.title, mediaCarouselItem.title) && kotlin.jvm.internal.m.c(this.subtitle, mediaCarouselItem.subtitle) && kotlin.jvm.internal.m.c(this.accessibilityText, mediaCarouselItem.accessibilityText) && kotlin.jvm.internal.m.c(this.backgroundImageUrl, mediaCarouselItem.backgroundImageUrl) && kotlin.jvm.internal.m.c(this.backgroundVideoUrl, mediaCarouselItem.backgroundVideoUrl) && kotlin.jvm.internal.m.c(this.onItemClick, mediaCarouselItem.onItemClick)) {
            return true;
        }
        return false;
    }

    public final String getAccessibilityText() {
        return this.accessibilityText;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    public final ho.a getOnItemClick() {
        return this.onItemClick;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.title.hashCode() * 31;
        String str = this.subtitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        String str2 = this.accessibilityText;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int c5 = j0.c.c((i11 + hashCode2) * 31, 31, this.backgroundImageUrl);
        String str3 = this.backgroundVideoUrl;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return this.onItemClick.hashCode() + ((c5 + i10) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.accessibilityText;
        String str4 = this.backgroundImageUrl;
        String str5 = this.backgroundVideoUrl;
        ho.a aVar = this.onItemClick;
        StringBuilder s10 = defpackage.f.s("MediaCarouselItem(title=", str, ", subtitle=", str2, ", accessibilityText=");
        defpackage.f.x(s10, str3, ", backgroundImageUrl=", str4, ", backgroundVideoUrl=");
        s10.append(str5);
        s10.append(", onItemClick=");
        s10.append(aVar);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
