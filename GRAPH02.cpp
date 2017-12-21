#include <stdio.h>

typedef struct _sNode { struct _sNode *left, *right; } tNode;

// Node naming uses (t)op, (l)eft, and (r)ight.
tNode t_l_l_l = {NULL,     NULL    }; // level 3
tNode t_l_l_r = {NULL,     NULL    };
tNode t_r_l_l = {NULL,     NULL    };
tNode t_r_l_r = {NULL,     NULL    };
tNode t_r_r_r = {NULL,     NULL    };
tNode t_l_l   = {&t_l_l_l, &t_l_l_r}; // level 2
tNode t_r_l   = {&t_r_l_l, &t_r_l_r};
tNode t_r_r   = {NULL,     &t_r_r_r};
tNode t_l     = {&t_l_l,   NULL    }; // level 1
tNode t_r     = {&t_r_l,   &t_r_r  };
tNode t       = {&t_l,     &t_r    }; // level 0 (root)

static int getCAL (tNode *node, int curr, int desired) {
    if (node == NULL) return 0;
    if (curr == desired) return 1;
    return getCAL (node->left,  curr+1, desired) +
           getCAL (node->right, curr+1, desired);
}

int main (void) {
    for (int i = 0; i < 4; i++)
        printf ("Level %d has %d node(s)\n", i, getCAL (&t, 0, i));
    return 0;
}