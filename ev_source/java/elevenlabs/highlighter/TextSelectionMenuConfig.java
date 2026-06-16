package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/highlighter/TextSelectionMenuConfig;", "", "menuItems", "", "Lio/elevenlabs/highlighter/TextSelectionMenuItem;", "<init>", "(Ljava/util/List;)V", "getMenuItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class TextSelectionMenuConfig {
    public static final int $stable = 8;
    private final List<TextSelectionMenuItem> menuItems;

    public /* synthetic */ TextSelectionMenuConfig(List list, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? tn.t.f33547a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextSelectionMenuConfig copy$default(TextSelectionMenuConfig textSelectionMenuConfig, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = textSelectionMenuConfig.menuItems;
        }
        return textSelectionMenuConfig.copy(list);
    }

    public final List<TextSelectionMenuItem> component1() {
        return this.menuItems;
    }

    public final TextSelectionMenuConfig copy(List<TextSelectionMenuItem> menuItems) {
        menuItems.getClass();
        return new TextSelectionMenuConfig(menuItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof TextSelectionMenuConfig) && kotlin.jvm.internal.m.c(this.menuItems, ((TextSelectionMenuConfig) other).menuItems)) {
            return true;
        }
        return false;
    }

    public final List<TextSelectionMenuItem> getMenuItems() {
        return this.menuItems;
    }

    public int hashCode() {
        return this.menuItems.hashCode();
    }

    public String toString() {
        return ib.i.k("TextSelectionMenuConfig(menuItems=", Separators.RPAREN, this.menuItems);
    }

    public TextSelectionMenuConfig(List<TextSelectionMenuItem> list) {
        list.getClass();
        this.menuItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextSelectionMenuConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
