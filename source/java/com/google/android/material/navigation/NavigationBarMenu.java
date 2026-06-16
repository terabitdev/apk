package com.google.android.material.navigation;

import a8.c;
import android.content.Context;
import android.support.v4.media.session.m;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class NavigationBarMenu extends MenuBuilder {
    public static final int NO_MAX_ITEM_LIMIT = Integer.MAX_VALUE;
    private final int maxItemCount;
    private final boolean subMenuSupported;

    @NonNull
    private final Class<?> viewClass;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i, boolean z10) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
        this.subMenuSupported = z10;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int i, int i3, int i8, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i, i3, i8, charSequence);
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder v = m.v("Maximum number of items supported by ", simpleName, " is ");
        v.append(this.maxItemCount);
        v.append(". Limit can be checked with ");
        v.append(simpleName);
        v.append("#getMaxItemCount()");
        throw new IllegalArgumentException(v.toString());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i, int i3, int i8, @NonNull CharSequence charSequence) {
        if (this.subMenuSupported) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i3, i8, charSequence);
            NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(getContext(), this, menuItemImpl);
            menuItemImpl.setSubMenu(navigationBarSubMenu);
            return navigationBarSubMenu;
        }
        c.u(this.viewClass.getSimpleName().concat(" does not support submenus"));
        return null;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
